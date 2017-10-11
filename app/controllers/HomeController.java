package controllers;

import play.mvc.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {
	
	// adding a comment to LearningBranch01
	
	// adding a comment to LearningBranch02
	
	// adding another comment to LearningBranch02
	
	// adding yet another comment to LearningBranch02
	
	// this should only appear in the "alpha" and "beta" branches

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        return ok(views.html.index.render());
    }

}
