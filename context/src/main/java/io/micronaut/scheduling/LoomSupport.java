/*
 * Copyright 2017-2021 original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.micronaut.scheduling;

import java.util.Optional;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

/**
 * Adds support for Loom virtual threads.
 */
public final class LoomSupport {
    /**
     * returns an executor service using virtual threads.
     * @param threadFactory the thread factory
     * @return a non-empty optional if virtual threads are supported
     */
    public Optional<ExecutorService> newVirtualThreadExecutorService(ThreadFactory threadFactory) {
        return Optional.empty();
    }
}