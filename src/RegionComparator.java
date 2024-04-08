import java.util.Comparator;
public class RegionComparator implements Comparator<Covid19Data>{
    @Override
    public int compare(Covid19Data d1, Covid19Data d2) { //hvad gør d1 og d2 ift. dataen?
        return d1.getRegion().compareTo(d2.getRegion());
    }

}
