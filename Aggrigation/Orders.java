package Aggrigation;

public class Orders {
    int id;
    String orderID;
    String product;
    user userId; //entity reference
Orders(int id,String orderID,String product, user userId)
{
    this.id=id;
    this.orderID=orderID;
    this.product=product;
    this.userId=userId;

}
private void showData()
{
    System.out.println(
                    "id : " + id +"\n"+
                    "OrderID : " + orderID +"\n"+
                    "Product : " + product+ "\n"+
                    "UserID : " + userId +"\n"
    );

}

    public static void main(String[] args) {
    user U = new user(1,"ABC");
    Orders O = new Orders(1,"S126C","Watch",U);
    O.showData();
}
}
