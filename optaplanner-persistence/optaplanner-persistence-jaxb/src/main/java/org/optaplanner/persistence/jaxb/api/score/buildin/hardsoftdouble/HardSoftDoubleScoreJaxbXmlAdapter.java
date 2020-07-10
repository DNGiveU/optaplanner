/*
 * Copyright 2020 Red Hat, Inc. and/or its affiliates.
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

package org.optaplanner.persistence.jaxb.api.score.buildin.hardsoftdouble;

import org.optaplanner.core.api.score.buildin.hardsoftdouble.HardSoftDoubleScore;
import org.optaplanner.persistence.jaxb.api.score.AbstractScoreJaxbXmlAdapter;

@SuppressWarnings("checkstyle:javadocstyle")
/**
 * @deprecated Double-based scores are deprecated as floating point numbers can't represent a decimal number correctly.
 */
@Deprecated(/* forRemoval = true */)
public class HardSoftDoubleScoreJaxbXmlAdapter extends AbstractScoreJaxbXmlAdapter<HardSoftDoubleScore> {

    @Override
    public HardSoftDoubleScore unmarshal(String scoreString) {
        return HardSoftDoubleScore.parseScore(scoreString);
    }

}