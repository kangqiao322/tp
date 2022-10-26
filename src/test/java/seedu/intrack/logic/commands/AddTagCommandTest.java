package seedu.intrack.logic.commands;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static seedu.intrack.logic.commands.CommandTestUtil.VALID_TAG_URGENT;
import static seedu.intrack.logic.commands.CommandTestUtil.VALID_TAG_REMOTE;
import static seedu.intrack.logic.commands.CommandTestUtil.assertCommandFailure;
import static seedu.intrack.logic.commands.CommandTestUtil.assertCommandSuccess;
import static seedu.intrack.logic.commands.CommandTestUtil.showInternshipAtIndex;
import static seedu.intrack.testutil.TypicalIndexes.INDEX_FIRST_INTERNSHIP;
import static seedu.intrack.testutil.TypicalIndexes.INDEX_SECOND_INTERNSHIP;
import static seedu.intrack.testutil.TypicalInternships.getTypicalInTrack;

import seedu.intrack.commons.core.Messages;
import seedu.intrack.commons.core.index.Index;
import seedu.intrack.model.InTrack;
import seedu.intrack.model.Model;
import seedu.intrack.model.ModelManager;
import seedu.intrack.model.UserPrefs;
import seedu.intrack.model.internship.Internship;
import seedu.intrack.model.tag.Tag;
import seedu.intrack.testutil.InternshipBuilder;

import java.util.*;

class AddTagCommandTest {

    private static final Tag TAG_STUB = new Tag("Some_tag");
    private static final List<Tag> TAGLIST_STUB = new ArrayList<Tag>(Arrays.asList(new Tag(VALID_TAG_REMOTE),
            new Tag(VALID_TAG_URGENT)));

    private static final List<Tag> TAGLIST_STUB_1 = new ArrayList<Tag>(Arrays.asList(new Tag(VALID_TAG_REMOTE),
            new Tag(VALID_TAG_URGENT)));
    private Model model = new ModelManager(getTypicalInTrack(), new UserPrefs());
/*
    @Test
    void execute() {
        Internship firstInternship = model.getFilteredInternshipList().get(INDEX_FIRST_INTERNSHIP.getZeroBased());
        Internship editedInternship = new InternshipBuilder(firstInternship).withTags("Urgent", "Zebra").build();

        AddTagCommand addTagCommand = new AddTagCommand(INDEX_FIRST_INTERNSHIP,
                TAGLIST_STUB);

        String expectedMessage = String.format(AddTagCommand.MESSAGE_ADD_TAG_SUCCESS,
                editedInternship);

        Model expectedModel = new ModelManager(new InTrack(model.getInTrack()), new UserPrefs());
        expectedModel.setInternship(firstInternship, editedInternship);

        assertCommandSuccess(addTagCommand, model, expectedMessage, expectedModel);

    }

    /**
     * Edit filtered list where index is larger than size of filtered list,
     * but smaller than size of intrack book
     */
    @Test
    public void execute_invalidInternshipIndexFilteredList_failure() {
        showInternshipAtIndex(model, INDEX_FIRST_INTERNSHIP);
        Index outOfBoundIndex = INDEX_SECOND_INTERNSHIP;
        // ensures that outOfBoundIndex is still in bounds of intrack book list
        assertTrue(outOfBoundIndex.getZeroBased() < model.getInTrack().getInternshipList().size());
        AddTagCommand addTagCommand = new AddTagCommand(outOfBoundIndex, TAGLIST_STUB);
        assertCommandFailure(addTagCommand, model, Messages.MESSAGE_INVALID_INTERNSHIP_DISPLAYED_INDEX);
    }
/*
    @Test
    public void equals() {
        final AddTagCommand standardCommand = new AddTagCommand(INDEX_FIRST_INTERNSHIP,
                TAGLIST_STUB);

        // same values -> returns true
        AddTagCommand commandWithSameValues = new AddTagCommand(INDEX_FIRST_INTERNSHIP,
                TAGLIST_STUB);
        assertTrue(standardCommand.equals(commandWithSameValues));

        // same object -> returns true
        assertTrue(standardCommand.equals(standardCommand));

        // null -> returns false
        assertFalse(standardCommand.equals(null));

        // different types -> returns false
        assertFalse(standardCommand.equals(new ClearCommand()));

        // different index -> returns false
        assertFalse(standardCommand.equals(new AddTagCommand(INDEX_SECOND_INTERNSHIP,
                TAGLIST_STUB)));

        // different taglist -> returns false
        assertFalse(standardCommand.equals(new AddTagCommand(INDEX_FIRST_INTERNSHIP,
                TAGLIST_STUB_1)));
    }
    */
}
