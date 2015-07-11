/*
 * Copyright 2015 ArcBees Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.gwtplatform.dispatch.rest.processors.resource;

import javax.lang.model.element.ExecutableElement;

import com.gwtplatform.dispatch.rest.processors.domain.EndPointDetails;
import com.gwtplatform.dispatch.rest.processors.domain.Type;

import static com.gwtplatform.dispatch.rest.processors.NameFactory.methodName;

public class ResourceMethodContext {
    private final Type parent;
    private final EndPointDetails endPoint;
    private final ExecutableElement element;

    public ResourceMethodContext(
            Type parent,
            EndPointDetails endPoint,
            ExecutableElement element) {
        this.parent = parent;
        this.endPoint = endPoint;
        this.element = element;
    }

    public Type getParent() {
        return parent;
    }

    public EndPointDetails getEndPoint() {
        return endPoint;
    }

    public ExecutableElement getElement() {
        return element;
    }

    @Override
    public String toString() {
        return methodName(parent, element);
    }
}
