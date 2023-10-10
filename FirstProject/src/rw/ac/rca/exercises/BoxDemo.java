package rw.ac.rca.exercises;

class BoxDemo {

     static class Box {
        int width;
        int height;
        int length;

        public Box(int width, int height, int length) {
            this.width = width;
            this.height = height;
            this.length = length;
        }

        public int volume() {
            return this.width * this.height * this.length;
        }
    }
}

class Box {
    public static void main(String[] args) {
        BoxDemo.Box b1 = new BoxDemo.Box(10,10,10);
        System.out.println("The volume is " + b1.volume());
    }
}
