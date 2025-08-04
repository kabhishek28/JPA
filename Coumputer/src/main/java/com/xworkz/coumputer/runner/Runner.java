package com.xworkz.coumputer.runner;

import com.xworkz.coumputer.entity.CPU;
import com.xworkz.coumputer.entity.Monitor;
import com.xworkz.coumputer.entity.Printer;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {


        EntityManagerFactory eMF = Persistence.createEntityManagerFactory("Xworkz3");
        EntityManager eM = eMF.createEntityManager();


        EntityManagerFactory eMF1 = Persistence.createEntityManagerFactory("Xworkz4");
        EntityManager eM1 = eMF1.createEntityManager();


        EntityManagerFactory eMF2 = Persistence.createEntityManagerFactory("Xworkz5");
        EntityManager eM2 = eMF2.createEntityManager();



//        CPU cpu1 = new CPU( "AMD", "Ryzen 7 5800X", 8, 16, 3.8, "x86_64", false, 36, 105, "AM4");
//        CPU cpu2 = new CPU("Intel", "Core i7-12700K", 12, 20, 3.6, "x86_64", true, 25, 125, "LGA1700");
//
//        Monitor monitor1 = new Monitor( "Dell", "UltraSharp U2723QE", 27.0, "3840x2160", 60, "IPS", false, 5.0, "HDMI, DisplayPort, USB-C", 49999.00);
          List<CPU> cpuList = new ArrayList<>();

        cpuList.add(new CPU("AMD", "Ryzen 5 5600", 6, 12, 3.5, "x86_64", false, 35, 65, "AM4"));
        cpuList.add(new CPU("Intel", "Core i5-12400", 6, 12, 2.5, "x86_64", true, 18, 65, "LGA1700"));
        cpuList.add(new CPU("Apple", "M1", 8, 8, 3.2, "ARM", true, 16, 15, "Apple Silicon"));
        cpuList.add(new CPU("Intel", "Core i9-13900K", 24, 32, 3.0, "x86_64", true, 36, 125, "LGA1700"));
        cpuList.add(new CPU("AMD", "Ryzen 9 7900X", 12, 24, 4.7, "x86_64", false, 76, 170, "AM5"));
        cpuList.add(new CPU("Intel", "Core i3-13100", 4, 8, 3.4, "x86_64", true, 12, 60, "LGA1700"));
        cpuList.add(new CPU("AMD", "Ryzen 3 3200G", 4, 4, 3.6, "x86_64", true, 6, 65, "AM4"));
        cpuList.add(new CPU("Qualcomm", "Snapdragon 8 Gen 2", 8, 8, 3.2, "ARM", true, 8, 10, "Mobile"));


        List<Monitor> monitorList = new ArrayList<>();

         monitorList.add(new Monitor( "LG", "27GN950-B", 27.0, "3840x2160", 144, "IPS", false, 1.0, "HDMI, DisplayPort", 64999.00));
        monitorList.add(new Monitor( "Samsung", "Odyssey G7", 32.0, "2560x1440", 240, "VA", true, 1.0, "HDMI, DisplayPort", 58999.00));
        monitorList.add(new Monitor( "Asus", "TUF VG259QM", 24.5, "1920x1080", 280, "IPS", false, 1.0, "HDMI, DisplayPort", 25999.00));
        monitorList.add(new Monitor( "Acer", "Nitro XV272U", 27.0, "2560x1440", 170, "IPS", false, 1.0, "HDMI, DisplayPort", 28999.00));
        monitorList.add(new Monitor( "BenQ", "PD3200U", 32.0, "3840x2160", 60, "IPS", false, 4.0, "HDMI, DisplayPort, MiniDP", 51999.00));
        monitorList.add(new Monitor( "MSI", "Optix MAG272CQR", 27.0, "2560x1440", 165, "VA", true, 1.0, "HDMI, DisplayPort", 32999.00));
        monitorList.add(new Monitor( "HP", "X27q", 27.0, "2560x1440", 165, "IPS", false, 1.0, "HDMI, DisplayPort", 23999.00));
        monitorList.add(new Monitor( "Gigabyte", "M32Q", 32.0, "2560x1440", 165, "IPS", false, 1.0, "HDMI, DisplayPort", 35999.00));
        monitorList.add(new Monitor( "ViewSonic", "VX2776-4K-MHD", 27.0, "3840x2160", 60, "IPS", false, 4.0, "HDMI, DisplayPort", 29999.00));


        List<Printer> printerList = new ArrayList<>();

        printerList.add(new Printer( "HP", "LaserJet Pro M404dn", "Laser", true, false, 38, 1200, "A4", 18999.00));
        printerList.add(new Printer( "Canon", "PIXMA G3020", "Inkjet", true, true, 10, 4800, "A4, A5", 17499.00));
        printerList.add(new Printer( "Epson", "EcoTank L3211", "Inkjet", true, false, 33, 5760, "A4", 14499.00));
        printerList.add(new Printer( "Brother", "DCP-L2541DW", "Laser", false, true, 30, 2400, "A4, Letter", 22999.00));
        printerList.add(new Printer( "Samsung", "Xpress M2021", "Laser", false, false, 20, 1200, "A4", 8999.00));
        printerList.add(new Printer( "Lexmark", "MB2236adw", "Laser", true, true, 36, 600, "A4, A5", 21999.00));
        printerList.add(new Printer( "Ricoh", "SP 210", "Laser", false, false, 22, 1200, "A4", 7499.00));
        printerList.add(new Printer("Xerox", "B210", "Laser", false, true, 31, 1200, "A4", 14999.00));
        printerList.add(new Printer("Kyocera", "ECOSYS P2040dn", "Laser", false, false, 40, 1200, "A4", 27999.00));
        printerList.add(new Printer("HP", "DeskJet 2331", "Inkjet", true, false, 7, 4800, "A4", 3999.00));

        try{

            for(CPU cpu :cpuList){
                eM.getTransaction().begin();
                eM.persist(cpu);
                eM.getTransaction().commit();
            }

            for(Monitor monitor:monitorList){
                eM1.getTransaction().begin();
                eM1.persist(monitor);
                eM1.getTransaction().commit();
            }

            for(Printer printer : printerList){
                eM2.getTransaction().begin();
                eM2.persist(printer);
                eM2.getTransaction().commit();
            }

        }catch (Exception e){
            System.out.println(e);
        }finally {
            eM.close();
            eM1.close();
            eM2.close();
        }




    }
}
