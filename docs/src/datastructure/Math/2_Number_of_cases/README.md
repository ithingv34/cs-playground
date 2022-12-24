# 경우의 수
 
- 어떤 사건에서 일어날 수 있는 경우의 가짓 수
  - 예) 동전을 던지는 사전: 경우의 수 2
  - 예) 주사위를 던지는 사전: 경우의 수 6

**`사건 A가 일어날 경우의 수: n(A)`**

**합의 법칙**
- 사건 A 또는 사건 B가 일어날 경우의 수


**`사건 A와 사건 B의 합의 법칙: n(A ∪ B) = n(A) + n(B) - n(A ∩ B)`**



**곱의 법칙**
- 사건 A와 사건 B가 동시에 일어날 경우의 수
  
**`사건 A와 사건 B의 곱의 법칙: n(A) X n(B)`**

---
**합의 법칙 예제**

- 두개의 주사위를 A, B 던졌을 때 두 수의 합이 3 또는 4의 배수일 경우의 수를 구해보자

**`HashSet`** 을 이용하여 중복을 제거하는 방법.
```java
int[] A = {1, 2, 3, 4, 5, 6};
int[] B = {1, 2, 3, 4, 5, 6};

HashSet<ArrayList> allCases = new HashSet<>();
for (int itemA : A) {
    for (int itemB: B) {
        if ((itemA + itemB) % 3 == 0 || (itemA + itemB) % 4 == 0) {
            ArrayList list = new ArrayList(Arrays.asList(itemA, itemB));
            allCases.add(list);
        }
    }
}
System.out.println("결과: " + allCases.size());

// 결과: 20
```
---
**곱의 법칙 예제**

- 두 개의 주사위 A, B를 던졌을 때  A는 3의 배수, B는 4의 배수인 모든 경우의 수를 구해보자.

```java
int[] A = {1, 2, 3, 4, 5, 6};
int[] B = {1, 2, 3, 4, 5, 6};

int nA = 0;
int nB = 0;

for (int itemA : A) {
    if (itemA % 3 == 0) {
        nA++;
    }
}

for (int itemB: B) {
    if (itemB % 4 == 0) {
        nB++;
    }
}

System.out.println("결과: " + (nA * nB));
// 결과: 2
```

---
**참고자료**
- [약수, 최소공배수, 최대공약수 구하기 (반복문)](https://github.com/ithingv34/cs-playground/blob/main/code/Math/src/NumberOfCases.java)
- [재귀를 활용하여 최대공약수 구하기]()