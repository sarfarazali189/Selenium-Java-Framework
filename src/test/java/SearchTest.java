import Pages.SearchHotel;
import org.testng.annotations.Test;

public class SearchTest {
SearchHotel s =new SearchHotel();



    @Test
    public void  search(){
        s.search_hotel("sarfarazali","docters400");

    }

}
