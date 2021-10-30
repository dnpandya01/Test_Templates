import java.io.*;
import java.net.*;
public class InetDemo{​​​​​​​​
public static void main(String[] args){​​​​​​​​
try{​​​​​​​​
InetAddress ip=InetAddress.getByName("www.google.com");
System.out.println(""+ip.getHostName());
System.out.printlin(""+ip.getHostAdddress());
        }
        ​​​​​​​​catch(Exception e){​​​​​​​​System.out.println(e);}​​​​​​​​
    }​​​​​​​​
}​​​​​​​​