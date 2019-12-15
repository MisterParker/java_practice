import java.util.Scanner;

class Train{
    int train_no;
    String src, dest;
    int time;
    int travelTime;
    int platform_no;
    String travelType; // A or D

    Train(int train_no, String src, String dest, int time, int travelTime, int platform_no, String travelType){
        this.train_no = train_no;
        this.src = src;
        this.dest = dest;
        this.time = time;
        this.travelTime = travelTime;
        this.platform_no = platform_no;
        this.travelType = travelType;
    }
}

class MGRStation{

    public static void SearchFunction(Train[] obj, int number){
        int count = 0, t=0;
        try{
            for(int i=0;i<obj.length;i++){
                if(number == obj[i].train_no){
                    count = 1;
                    t=i;
                    break;
                }
            }
            if(count == 1){
                System.out.println("######## Train Found ########");
                System.out.println("Train no    : "+obj[t].train_no);
                System.out.println("Source      : "+obj[t].src);
                System.out.println("Destination : "+obj[t].dest);
                System.out.println("Time        : "+obj[t].time);
                System.out.println("Duration    : "+obj[t].travelTime);
                System.out.println("Platform no : "+obj[t].platform_no);
                System.out.println("Travel Type : "+obj[t].travelType);
            }
            else{
                throw new ArrayIndexOutOfBoundsException("Train Not Found");
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        
    }

    public static void main(String []args){

        Scanner sc = new Scanner(System.in);

        Train t1 = new Train(12435, "Katpadi", "Chennai", 1000, 2, 10, "A");
        Train t2 = new Train(22679, "Chennai", "Bhilai", 1600, 24, 2, "D");
        Train t3 = new Train(12636, "Chennai", "Hyderabad", 4000, 12, 1, "D");

        Train obj[] = new Train[3];
        obj[0] = t1;
        obj[1] = t2;
        obj[2] = t3;

        System.out.println("Enter Train number");
        int search = Integer.parseInt(sc.nextLine());
        SearchFunction(obj, search);
    }
}