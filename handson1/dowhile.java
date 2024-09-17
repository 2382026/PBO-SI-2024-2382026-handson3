package handson1;

public class dowhile {
    public static void main(String[] args) {
        int i = 0;
        String [] buah = {"Apple", "Pisang", "Mangga", "Jeruk"};

        do{
            System.out.println(buah[i]);
            i++;
        } while ( i < 4);
    }
}
