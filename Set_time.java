public class Set_time extends Thread {

   static public int t;

   static void set(int time) {
      System.out.println("Participants have to answer each question in " + time + " seconds");

      t = time;

   }

}
