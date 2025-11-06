package PhoneModel;

public class phone {

        private int phoneid;
        private String modelname;
        private int price;

       public phone(int phoneid,String modelname,int price){
            this.phoneid = phoneid;
            this.modelname = modelname;
            this.price = price;
        }

    public int getPhoneid() {
        return phoneid; // this.phoneid;
    }

    public void setPhoneid(int phoneid) {
        this.phoneid = phoneid;
    }

    public String getModelname() {
        return modelname;
    }

    public void setModelname(String modelname) {
        this.modelname = modelname;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
