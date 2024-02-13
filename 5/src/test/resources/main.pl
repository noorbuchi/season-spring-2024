% Predicate to check if two individuals are enemies
enemy(X, Y) :-
    enemy_of(X, Y).

% Predicate to check if two individuals are friends
friend(X, Y) :-
    enemy(Z, X),
    enemy(Z, Y),
    \+ enemy(X, Y).

% Predicate to check if two individuals are indirectly connected as enemies
indirect_enemy(X, Y) :-
    enemy(X, Y);
    enemy(Y, X);
    (enemy(X, Z), indirect_enemy(Z, Y));
    (enemy(Y, Z), indirect_enemy(Z, X)).

% Predicate to check if two individuals are indirectly connected as friends
indirect_friend(X, Y) :-
    friend(X, Y);
    (friend(X, Z), indirect_friend(Z, Y)).

% Facts to define the enemy relationships
enemy_of(john, peter).
enemy_of(mary, peter).
enemy_of(peter, anna).
enemy_of(mary, sarah).
enemy_of(peter, john).
enemy_of(peter, mary).

