/*
 * Copyright 2017-2022 original authors
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
package io.micronaut.crac.support;

import io.micronaut.core.annotation.Experimental;
import io.micronaut.core.annotation.NonNull;
import jakarta.inject.Singleton;
import org.crac.Context;
import org.crac.Core;
import org.crac.Resource;

/**
 * A singleton to return the Global context for Coordinated Restore at Checkpoint.
 *
 * @author Tim Yates
 * @since 3.7.0
 */
@Experimental
@Singleton
public class GlobalCracContextProvider implements CracResourceContextProvider<Context<? extends Resource>> {

    @Override
    @NonNull
    public Context<? extends Resource> createContext() {
        return Core.getGlobalContext();
    }
}