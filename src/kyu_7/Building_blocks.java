package kyu_7;

//https://www.codewars.com/kata/building-blocks/train/java
public class Building_blocks {

    public static class Block{

        int width;
        int length;
        int height;

        public Block(int[] a){
            this.width = a[0];
            this.length = a[1];
            this.height = a[2];
        }

        public int getWidth(){
            return width;
        }
        public int getLength(){
            return length;
        }
        public int getHeight(){
            return height;
        }

        public int getVolume(){
            return width*length*height;
        }
        public int getSurfaceArea(){
            return 2 * (length * height) + 2 * (length * width) + 2 * (width * height);
        }
    }

    public static void main(String[] args) {

       Block b = new Block(new int[]{2,2,2});
        System.out.println(b.getWidth());
        System.out.println(b.getLength());
        System.out.println(b.getHeight());
        System.out.println(b.getVolume());
        System.out.println(b.getSurfaceArea());
    }
}
