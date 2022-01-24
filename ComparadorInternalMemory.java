import java.util.Comparator;

public class ComparadorInternalMemory implements Comparator<Cellphone> {

    @Override
    public int compare(Cellphone c1, Cellphone c2) {
	if(c1.getInternalMemory() > c2.getInternalMemory())
	    return 1;
	if(c1.getInternalMemory() < c2.getInternalMemory())
	    return -1;
	return 0;
    }

}
