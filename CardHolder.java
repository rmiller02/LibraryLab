public class CardHolder {
    private String cardholdername;
    private int cardnumber, bookscheckdout;
    private String address;

    public CardHolder(String name, String address) {
        this.cardholdername = cardholdername;
        this.address = address;
    }

    public String getCardholdername() {
        return cardholdername;
    }

    public void setCardholdername(String name) {
        this.cardholdername = cardholdername;
    }

    public int getCardnumber() {
        return cardnumber;
    }

    public void setCardnumber(int cardnumber) {
        this.cardnumber = cardnumber;
    }

    public int getBookscheckdout() {
        return bookscheckdout;
    }

    public void setBookscheckdout(int bookscheckdout) {
        this.bookscheckdout = bookscheckdout;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    
}