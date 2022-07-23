package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        for (int i = 1; i <=height ; i++) {
            if(i==1 || i==height){
                for (int j = 1; j <=height ; j++) {
                    System.out.print("8");
                }
                System.out.println("");
            }else if(i==2 || i==height-1){
                for (int j = 1; j <=height ; j++) {
                    if(j==1 || j==height){
                        System.out.print(" ");
                    }else{
                        System.out.print("8");
                    }
                }
                System.out.println("");
            }else if(i==3 || i==height-2){
                for (int j = 1; j <=height ; j++) {
                    if(j==1 || j==2 || j==height || j==height-1){
                        System.out.print(" ");
                    }else{
                        System.out.print("8");
                    }
                }
                System.out.println("");
            }
        }

    }
}
