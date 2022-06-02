package Machine;

public class A_Machine {

    /* 기계의 속성 */
    private String name;
    private String type;
    private int price;
    private String owner;
    /*ETC.. */

    /*Basic Contructor*/
    public A_Machine() {super();}

    public A_Machine(String name, String type, int price, String owner) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.owner = owner;
    }

    /*Basic Getter & Setter */
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String getType() {return type;}
    public void setType(String type) {this.type = type;}
    public int getPrice() {return price;}
    public void setPrice(int price) {this.price = price;}
    public String getOwner() {return owner;}
    public void setOwner(String owner) {this.owner = owner;}

    /*Basic toString*/
    @Override
    public String toString() {
        return "Machine{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", owner='" + owner + '\'' +
                '}';
    }

    /* 모든 기계는 작동한다. */
    /* 기계를 상속받는 모든 것들은 이 function을 Override 해야한다. */
    public String run(boolean power) {
       if(power) {
           return "Running.......";
       } else {
           return "........";
       }
    }


}
