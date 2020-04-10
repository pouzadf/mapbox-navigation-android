package com.mapbox.navigation.core.replay.history

import com.google.gson.annotations.SerializedName

/**
 * Replay event that fetched from [ReplayHistoryDTO]
 *
 * @param events Assumes chronological order, index 0 moves to [events.size] over time.
 */
data class ReplayEvents(
    val events: List<ReplayEventBase>
)

/**
 * Base interface event for ReplayEvent
 *
 * @property eventTimestamp timestamp of event milliseconds
 * @see [ReplayHistoryLocationEngine]
 */
interface ReplayEventBase {
    val eventTimestamp: Double
}

/**
 * todo docs
 * @param eventTimestamp timestamp of event milliseconds
 * @param timestamp Double todo docs
 */
data class ReplayEventGetStatus(
    @SerializedName("event_timestamp")
    override val eventTimestamp: Double
) : ReplayEventBase

/**
 * todo docs
 * @param eventTimestamp timestamp of event milliseconds
 * @param location todo docs
 */
data class ReplayEventUpdateLocation(
    @SerializedName("event_timestamp")
    override val eventTimestamp: Double,
    val location: ReplayEventLocation
) : ReplayEventBase

// todo docs
/**
 * Location of event for replaying route
 *
 * @param lon longitude
 * @param lat latitude
 * @param provider String?
 * @param time Double?
 * @param altitude Double?
 * @param accuracyHorizontal Double?
 * @param bearing Double?
 * @param speed Double?
 */
data class ReplayEventLocation(
    val lon: Double,
    val lat: Double,
    val provider: String?,
    val time: Double?,
    val altitude: Double?,
    val accuracyHorizontal: Double?,
    val bearing: Double?,
    val speed: Double?
)
