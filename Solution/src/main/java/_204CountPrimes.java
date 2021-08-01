import java.util.Arrays;

public class _204CountPrimes {
  public int countPrimes(int n) {
    if (n <= 1) {
      return 0;
    }
    boolean[] primes = new boolean[n];
    primes[0] = false;
    primes[1] = false;
    for (int i = 2; i < n; i++) {
      primes[i] = true;
    }

    for (int i = 2; i * i < n; i++) {
      if (primes[i]) {
        for (int j = i; i * j < n; j++) {
          primes[i * j] = false;
        }
      }
    }
    int count = 0;
    for (boolean prime : primes) {
      if (prime) {
        count++;
      }
    }
    return count;
  }
}
