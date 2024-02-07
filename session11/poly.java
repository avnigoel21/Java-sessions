package session11;

// 1+2 = 3
//"1"+"2" = "12"


// smartphone -> cellPhone, GPS, Camera, Media Player
public class poly {

    interface MyCamera{
        void takeSnap();
        void recordVideo();

        // private void greet(){
        //     System.out.println("Good Morning");
        // }

        default void recod4KVideo(){
            // greet();
            System.out.println("Rocording in 4K");
        } 
    }

    interface MyWifi{
        String[] getNetworks();
        void connectToNetworks(String network);

    }

    static class MyCellPhone{
        void callNumber(int phoneNumber){
            System.out.println("calling");
        }
    }

    static class MySmartPhone extends MyCellPhone implements MyWifi , MyCamera{

        public void takeSnap(){
            System.out.println("taking snap");
        }
        public void recordVideo(){
            System.out.println("recording video");
        }

        public String[] getNetworks(){
            String [] networkList  =  {"Harry" , "Aditi" , "Taif" , "Anjali"};
            return networkList;
            
        }
        public void connectToNetworks(String network){
            System.out.println("connecting networks");
        }
        
    }

    public static void main(String[] args) {

        MyCamera camera = new MySmartPhone(); // This is a smartPhone but, use it as a camera 

        camera.recod4KVideo();
            
        //camera.connectToNetworks(); // not allowed

        MySmartPhone smartPhone = new MySmartPhone();

        smartPhone.callNumber(987654321);
        smartPhone.connectToNetworks(null);
        smartPhone.recod4KVideo();
        smartPhone.takeSnap();
        smartPhone.recordVideo();

    }
    
}


