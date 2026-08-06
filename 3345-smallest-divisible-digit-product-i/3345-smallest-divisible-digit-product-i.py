class Solution:
    def smallestNumber(self, n: int, t: int) -> int:

        while True:
            if self.digitProduct(n) % t == 0:
                return n
            n += 1

    def digitProduct(self, num: int) -> int:
        product = 1

        while num > 0:
            digit = num % 10
            product *= digit
            num //= 10

        return product