package io.github.jlprat.akka.http.workshop.java.bookstore.routes;

import akka.actor.ActorRef;
import akka.http.javadsl.server.AllDirectives;
import akka.http.javadsl.server.Route;

/**
 * Created by jlprat on 23.04.17.
 */
public class CatalogRoutes extends AllDirectives {

    private ActorRef catalogActorRef;

    public CatalogRoutes(ActorRef catalogActorRef) {
        this.catalogActorRef = catalogActorRef;
    }

    public Route catalogRoutes() {
        return null;
    }
}
