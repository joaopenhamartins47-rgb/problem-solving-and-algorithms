import java.util.HashSet;
import java.util.Set;

public class containsduplicate 
{
    //Problema: Verificar duplicados dentro de um array
    //Ideia: Utilizar um set em java que se em algum momento nao conseguir adicionar o valor no set, retorna true de duplicado, se terminar o for e nao conseguir retorna false
    static boolean temDuplicado(int[] nums) {
        Set<Integer>achou = new HashSet<>();
        for(int n: nums)
        {
            if(!achou.add(n))
                return true;
        }
        return false;
    }
}
