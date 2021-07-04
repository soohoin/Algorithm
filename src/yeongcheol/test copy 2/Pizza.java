import java.util.*;

public abstract class Pizza{
    public enum Topping { HAM, MUSHROOM, ONION, PEPPER, SAUSAGE }
    final Set<Topping> toppings;
    
    abstract static class Builder<T extends Builder<T>> {
       EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);
       
       // 하위 클래스 에서 공통으로 사용할 토핑 
       public T addTopping(Topping topping) {
          toppings.add(Objects.requireNonNull(topping));
          return self();
       }
 
       // Pizza 를 상속받은 클래스 ( NyPizza , Calzone ) return 
       // 메서드를 구현할 때 NyPizza 와 Calzome의 생성자를 호출하게 된다.
       // new NyPizza(this) , new Calzone(this);
       abstract Pizza build();
 
       // 하위 클래스는 이 메서드를 재정의하고 this를 반환하도록 해야 한다.
       protected abstract T self();
    }
 
    // 저장된 토핑이 build()를 호출할 때 각각 생성자에서 super(builer)를 호출하고
    // super는 Pizza의 생성자 이므로 아래의 Pizza가 호출 되면서 토핑을 clone()해서
    // 저장한다.
    Pizza(Builder<?> builder) {
       toppings = builder.toppings.clone();
    }
    
    // 실제 토핑값을 찍어보기 위한 toString() 재정의
    @Override
    public String toString() {
      Iterator iterator = toppings.iterator();
      String returnStr = "";
      while(iterator.hasNext()) {
         returnStr += iterator.next() + ", ";
      }
      return returnStr;
    }
 }
 