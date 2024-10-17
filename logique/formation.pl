% Faits

etudie(programmation, john).
etudie(mathematiques, tom).

enseigne(programmation, mary).
enseigne(mathematiques, alice).

% Règles
% etudiant(X) :- etudie(Matiere, X).
etudiant(X) :- etudie(_, X).
% enseignant(X) :- enseigne(Matiere, X).
enseignant(X) :- enseigne(_, X).

etudiant_a_enseignant(X, Y) :- etudie(Matiere, X) , enseigne(Matiere, Y).