·       Ability to view the details of the feature.

Spring Boot Application

Controller:

@Controller
public class HelpController {
 
   @GetMapping("/help")
   public String displayHelpPage() {
       return "help-page";
   }
 
   @GetMapping("/dataentry")
   public String displayDataEntryPage() {
       return "dataentry-page";
   }
 
   @GetMapping("/drilldown")
   public String displayDrillDownPage() {
       return "drilldown-page";
   }
 
   @GetMapping("/performance")
   public String displayPerformancePage() {
       return "performance-page";
   }
 
   @GetMapping("/regionaldata")
   public String displayRegionalDataPage() {
       return "regionaldata-page";
   }
 
   @GetMapping("/trendpage")
   public String displayTrendPage() {
       return "trendpage-page";
   }
 
   @GetMapping("/viewingdata")
   public String displayViewingDataPage() {
       return "viewingdata-page";
   }
}

Service:

@Service
public class HelpService {
 
   public List<Feature> getFeatures() {
       List<Feature> features = new ArrayList<>();
 
       features.add(new Feature("Data Entry", "Giving details on how to fill out the Manual Edit."));
       features.add(new Feature("Drill Down", "Giving details on how to 'drill down' into the finer details of the data in header menu options."));
       features.add(new Feature("Performance", "Giving details on how to use the Period to compare data from two periods and to download the data."));
       features.add(new Feature("Regional Data", "Giving details on how to use the Region to view data based on specific area constraints and then how to 'drill down' into the finer details."));
       features.add(new Feature("Trend Page", "Giving details on how to use the Trend to graphically represent the FoDI data."));
       features.add(new Feature("Viewing Data", "Giving details on how to select date ranges within the Distribution."));
 
       return features;
   }
}

Repository:

@Repository
public interface FeatureRepository extends JpaRepository<Feature, Long> {
 
   List<Feature> findByName(String name);
 
}