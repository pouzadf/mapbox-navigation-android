package com.mapbox.navigation.core.trip.session

import com.mapbox.api.directions.v5.models.VoiceInstructions
import com.mapbox.navigation.core.MapboxNavigation

/**
 * Voice instruction callback, could be registered via [MapboxNavigation.registerVoiceInstructionsObserver]
 */
interface VoiceInstructionsObserver {
    /**
     * Called every time on a new [VoiceInstructions] is applicable
     */
    fun onNewVoiceInstructions(voiceInstructions: VoiceInstructions)
}
