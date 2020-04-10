package com.mapbox.navigation.core.trip.session

import com.mapbox.api.directions.v5.models.BannerInstructions
import com.mapbox.navigation.base.trip.model.RouteProgress

/**
 * Banner instruction that could be helpful for routing. Updated on route progress
 * @see [RouteProgress]
 */
interface BannerInstructionsObserver {

    /**
     * Called whenever new banner instruction available
     * @see [RouteProgress]
     */
    fun onNewBannerInstructions(bannerInstructions: BannerInstructions)
}
