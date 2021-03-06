/*
 * Copyright 2019 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.numkt.math

import org.jetbrains.numkt.callFunc
import org.jetbrains.numkt.core.KtNDArray

/**
 * Returns the lowest common multiple of |x1| and |x2|
 */
fun <T : Number> lcm(x1: KtNDArray<T>, x2: KtNDArray<T>): KtNDArray<T> =
    callFunc(nameMethod = arrayOf("lcm"), args = arrayOf(x1, x2))

/**
 * Returns the greatest common divisor of |x1| and |x2|
 */
fun <T : Number> gcd(x1: KtNDArray<T>, x2: KtNDArray<T>): KtNDArray<T> =
    callFunc(nameMethod = arrayOf("gcd"), args = arrayOf(x1, x2))