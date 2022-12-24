# 집합

- 특정 조건에 맞는 원소들의 모임
- Java에서는 `HashSet` 을 활용하여 집합 연산을 할 수 있다.

**교집합**
- 두 집합이 공통으로 포함하는 원소로 이루어진 집합

![img.png](../../../../images/datastructure/Math/1-1.png)

- `retainAll()`
  - 두 집합에서 동일하게 포함하고 있는 원소만 있는 집합을 만든다.

```java
// 교집합
HashSet a = new HashSet<>(Arrays.asList(1,2,3,4,5));
HashSet b = new HashSet(Arrays.asList(2,4,6,8,10));
a.retainAll(b);

System.out.println("교집합: " + a); // 교집합: [2, 4]
```

---

**합집합**
- 어느 하나에라도 속하는 원소들을 모두 모은 집합

![img.png](../../../../images/datastructure/Math/1-2.png)

- `addAll()`
  - 두 집합의 원소들을 합한 집합을 만든다.
  - 집합이므로 중복된 원소는 1개만 포함된다.

```java
// 합집합
HashSet c = new HashSet<>(Arrays.asList(1,2,3,4,5));
HashSet d = new HashSet(Arrays.asList(2,4,6,8,10));

System.out.println("합집합");
c.addAll(d);
System.out.println("합집합: " + c); // 합집합: [1, 2, 3, 4, 5, 6, 8, 10]

```
---
**차집합**
- A(or B)에만 속하는 원소들의 집합

![img.png](../../../../images/datastructure/Math/1-3.png)

- `removeAll()`
  - 인수로 주는 집합의 포함된 동일한 원소들을 제거한다.

```java
// 차집합
HashSet e = new HashSet<>(Arrays.asList(1,2,3,4,5));
HashSet f = new HashSet(Arrays.asList(2,4,6,8,10));

System.out.println("차집합");
e.removeAll(f);
System.out.println("차집합: " + e); // 차집합: [1, 3, 5]
```
---
**여집합**
- 전체 집합 중 A의 원소가 아닌 것들의 집합

![img.png](../../../../images/datastructure/Math/1-4.png)

---

**부분집합(집합 포함 여부)**

![img.png](../../../../images/datastructure/Math/1-5.png)

- `containsAll()`
  - 인수로 주는 집합이 부분 집합이면 true이다

```java
HashSet g = new HashSet<>(Arrays.asList(1,2,3,4,5));
HashSet h = new HashSet(Arrays.asList(1,2));
System.out.println(g.containsAll(h)); // true
```


---
**참고자료**
- [ArrayList를 활용하여 집합의 기능(교집합, 합집합, 차진합)을 구현한 코드](https://github.com/ithingv34/cs-playground/blob/main/code/Math/src/MySet.java) 
- [Java HashSet.retainAll](https://codechacha.com/ko/java-collections-arraylist-retainall/)
- [Java HashSet.addAll](https://codechacha.com/ko/java-collections-hashset-addall/)
- [Java HashSet.removeAll](https://codechacha.com/ko/java-collections-arraylist-removeall/)
- [Java HashSet.containsAll](https://codechacha.com/ko/java-check-if-list-contains-all-of-list/)
- [HashSet 삽입, 삭제, 탐색](https://godog.tistory.com/entry/Java-HashSet-%EC%A7%91%ED%95%A9-%EC%82%BD%EC%9E%85-%EC%82%AD%EC%A0%9C-%ED%83%90%EC%83%89)


