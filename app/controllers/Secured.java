package controllers;

import play.mvc.Http.Context;
import play.mvc.Result;
import play.mvc.Security;

public class Secured extends Security.Authenticator {
    @Override
    public String getUsername(Context ctx) {
        System.out.println(ctx.session().get("name"));return ctx.session().get("name");
    }

    @Override
    public Result onUnauthorized(Context context) {
        return redirect(routes.HomeController.login_get());
    }

    public static String getName(Context ctx) {
        return ctx.session().get("name");
    }
}
