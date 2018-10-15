public class Pyramid1 {
    public static void main(String[] args) {
        int numberoflines=6,col=numberoflines;
        for(int row=0;row<numberoflines;row++){
            col=numberoflines-row;
            for(int i=0;i<col;i++){
                System.out.println(i);
            }
        }
    }
}
