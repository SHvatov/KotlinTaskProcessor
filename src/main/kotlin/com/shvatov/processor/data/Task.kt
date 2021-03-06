package com.shvatov.processor.data

/**
 * @author shvatov
 */
data class Task<P : Any, R : Any>(
    /**
     * Object, which is used as a argument for the provided [action].
     */
    val payload: P,

    /**
     * Task itself, which must be computed by the processor instance.
     */
    val action: suspend (P) -> R?
)