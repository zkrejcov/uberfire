/*
 * Copyright 2015 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.uberfire.java.nio.base.dotfiles;

import org.uberfire.java.nio.file.CopyOption;
import org.uberfire.java.nio.file.OpenOption;
import org.uberfire.java.nio.file.Option;

public class DotFileOption implements Option,
                                      OpenOption,
                                      CopyOption {

    @Override
    public boolean equals( final Object o ) {
        if ( this == o ) {
            return true;
        }
        if ( o == null || getClass() != o.getClass() ) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        return DotFileOption.class.hashCode();
    }
}
