package io.nonamuckja.backend.domain.party;

import io.nonamuckja.backend.domain.Coordinate;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class PartySearch {
	private Coordinate from;
	private Coordinate to;
	@Builder.Default
	private PartyStatus status = PartyStatus.OPEN;
}
