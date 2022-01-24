import java.util.Comparator;

public class ComparatorBrand implements Comparator<Cellphone> {

    @Override
    public int compare(Cellphone c1, Cellphone c2) {
	return c1.getBrand().compareTo(c2.getBrand());
    }

}
