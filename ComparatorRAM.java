import java.util.Comparator;

public class ComparatorRAM implements Comparator<Cellphone> {

    @Override
    public int compare(Cellphone c1, Cellphone c2) {

	if(c1.getRam() > c2.getRam())
	    return 1;
	if(c1.getRam() < c2.getRam())
	    return -1;
	return 0;
    }

}
