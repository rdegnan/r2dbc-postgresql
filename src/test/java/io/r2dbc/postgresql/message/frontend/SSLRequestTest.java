/*
 * Copyright 2017-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.r2dbc.postgresql.message.frontend;

import org.junit.jupiter.api.Test;

import static io.r2dbc.postgresql.message.frontend.FrontendMessageAssert.assertThat;

final class SSLRequestTest {

    @Test
    void encode() {
        assertThat(SSLRequest.INSTANCE).encoded()
            .isDeferred()
            .isEncodedAs(buffer -> buffer
                .writeInt(8)
                .writeInt(80877103));
    }

}
