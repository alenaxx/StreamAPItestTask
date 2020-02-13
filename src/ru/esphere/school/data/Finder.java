package ru.esphere.school.data;


import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Finder {

    /**
     * Поиск групп людей старше определенного возраста. *
     * @param groups группы
     * @param targetAge возраст для поиска
     * @return список имен групп из списка групп старше возраста targetAge */

    public Set<String> findOldMembers(List<MembersGroup> groups, int targetAge) {

    {
        return groups.stream()//создаем стрим из объектов MembersGroup
                .flatMap(t->t.getMembers().stream()) //создаем стрим из объектов Member
                .filter(m->m.getAge()>targetAge)//фильтруем по возрасту больше targetAge
                .map(m->m.getName())//собираем имена отфильтрованных объектов
                .collect(Collectors.toSet());//преобразуем  в  Set
    }

    }
}
