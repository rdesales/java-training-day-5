import java.util.Collections;
import java.util.ArrayList;

public class Main {

    public static void main(String [] args) {

	ArrayList<Cellphone> cellphones = new ArrayList<Cellphone>();

	cellphones.add(new Cellphone("Apple", 512, 32, 1000));
	cellphones.add(new Cellphone("Apple", 256, 16, 800));
	cellphones.add(new Cellphone("Samsung", 256, 12, 700));
	cellphones.add(new Cellphone("HTC", 512, 12, 550));
	cellphones.add(new Cellphone("Huawei", 512, 32, 680));
	System.out.println("Printing before sorting:");
	System.out.println(cellphones);
	System.out.println("Sorting by cost (internal sorting):");
	Collections.sort(cellphones);
	System.out.println(cellphones);

	//Comparators
	ComparatorBrand cb = new ComparatorBrand();
	ComparadorInternalMemory cim = new ComparadorInternalMemory();
	ComparatorRAM cr = new ComparatorRAM();
	System.out.println("---------------Sorting by brand------------------");
	Collections.sort(cellphones, cb);
	System.out.println(cellphones);
	System.out.println("--------------Sorting by internal memory----------");
	Collections.sort(cellphones, cim);
	System.out.println(cellphones);

	System.out.println("---------------Sorting by RAM----------------------");
	Collections.sort(cellphones, cr);
	System.out.println(cellphones);



    }


}
