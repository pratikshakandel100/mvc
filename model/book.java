package model;
class book{
    String name;
    int price;
    String Category;
    String Publisher;
    String StoreName;
    int TotalPage;
    book(String name, int price, String Category, String Publisher, String StoreName, int TotalPage){
        this.name = name;
        this.price = price;
        this.Publisher = Publisher;
        this.StoreName = StoreName;
        this.TotalPage = TotalPage;
    }
    public String getname(){
        return this.name;
    }
    public void setname(String name){
        this.name = name;
    }
    public int getprice(){
        return this.price;
    }
    public String getCategory(){
        return this.Category;
    }
    public String getStoreName(){
        return this.StoreName;
    }
    public int TotalPage(){
        return this.TotalPage;
    }
}
