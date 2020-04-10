package com.mapbox.navigation.core.trip.session

import com.mapbox.navigation.core.MapboxNavigation

/**
 * Observer is working with navigation by the route, but not in free-drive mode.
 * Could be registered via [MapboxNavigation]
 */
interface OffRouteObserver {
    /**
     * Called whenever user is off route
     */
    fun onOffRouteStateChanged(offRoute: Boolean)
}
