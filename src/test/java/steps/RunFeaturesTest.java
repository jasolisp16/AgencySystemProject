/**
 * 
 */
package steps;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * @author JoseAdrianSolisPerez
 *
 */

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features", tags={"@Book"})
public class RunFeaturesTest {

}
