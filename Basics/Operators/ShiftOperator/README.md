## Shift Operator

The shift operators are used to perform bitwise left or right shifts on integer operands. They shift the bits of the operand by a specified number of positions.

### Types of Shift Operators

1. **Left Shift (<<)**: Shifts the bits of the operand to the left by a specified number of positions. Bits shifted out of the left end are discarded. Zeros are shifted into the right end.

For example: in a left shift operation `5 << 2` means `5 * 2^2`, so `5 * 4 = 20`.



2. **Right Shift (>>)**: Shifts the bits of the operand to the right by a specified number of positions. Bits shifted out of the right end are discarded. Zeroes or ones (depending on the sign of the operand) are shifted into the left end. 


For example: in a right shift operation `20 >> 2` means `20 / 2^2`, so `20 / 4 = 5`.


3. **Unsigned Right Shift (>>>)**: Shifts the bits of the operand to the right by a specified number of positions. Bits shifted out of the right end are discarded. Zeroes are always shifted into the left end, regardless of the sign of the operand. For example: `int result = -20 >>> 2; // result will be 1073741821`


