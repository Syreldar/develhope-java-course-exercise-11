import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lists
{
    public static void main(String[] args)
    {
        List<String> cityNames = Arrays.asList("New York", "London", "Tokyo");
        //cityNames.add("Berlin"); // UnsupportedOperationException: The cityNames list is immutable.
        cityNames.set(1, "Tegucigalpa");

        System.out.println(cityNames);

        List<String> kingsOfRome = new ArrayList<>(
                Arrays.asList(
                        "Romulus",
                        "Numa Pompilius",
                        "Tullus Hostilius",
                        "Ancus Marcius",
                        "Lucius Tarquinius Priscus",
                        "Servius Tullius",
                        "Lucius Tarquinius Superbus"
                )
        );
        System.out.println(kingsOfRome);

        String[] kingsOfRomeArray = kingsOfRome.toArray(new String[0]);
        kingsOfRomeArray[6] = "Lucius Tarquinius Supercar";

        System.out.println(Arrays.toString(kingsOfRomeArray));
    }
}
