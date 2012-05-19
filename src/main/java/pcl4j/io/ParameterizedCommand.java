/**
 *
 * Copyright to the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and limitations under the License.
 */

package pcl4j.io;

/**
 * Represents a Parameterized PCL command
 */
public class ParameterizedCommand extends PclCommand {
    public ParameterizedCommand(byte[] bytes) {
        super(bytes);
        validateBytes(bytes);
    }

    public ParameterizedCommand(long position, byte[] bytes) {
        super(position, bytes);
        validateBytes(bytes);
    }

    private void validateBytes(byte[] bytes) {
        if (bytes == null || bytes.length < 3) {
            throw new IllegalArgumentException("A parameterized command should have more than 2 bytes");
        }
    }
}