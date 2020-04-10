package com.mapbox.navigation.core.trip.session

import com.mapbox.navigation.base.trip.model.RouteProgress

/**
 * Callback that provide state/information/progress of current routing
 *
 * @see [RouteProgress]
 */
interface RouteProgressObserver {
    /**
     * Called every time on RouteProgress has changed
     */
    fun onRouteProgressChanged(routeProgress: RouteProgress)
}
