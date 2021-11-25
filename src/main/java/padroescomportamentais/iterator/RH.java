package padroescomportamentais.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;

public class RH implements Iterable<Policial>{

    private List<Policial> policiais = new ArrayList<Policial>();

    public RH(Policial... policiais){
        this.policiais = Arrays.asList(policiais);
    }

    @Override
    public Iterator<Policial> iterator(){
        return policiais.iterator();
    }

}
